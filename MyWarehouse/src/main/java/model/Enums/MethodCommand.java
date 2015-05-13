package model.Enums;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.command.actioncomandimpl.DeleteEntity;
import logic.command.actioncomandimpl.ErrorCommand;
import logic.command.actioncomandimpl.MainPage;
import logic.command.actioncomandimpl.Search;
import logic.command.actioncomandimpl.persistentity.ShowClient;
import logic.command.actioncomandimpl.persistentity.ShowDispatch;
import logic.command.actioncomandimpl.persistentity.ShowElementParty;
import logic.command.actioncomandimpl.persistentity.ShowGoods;
import logic.command.actioncomandimpl.persistentity.ShowOrderGoods;
import logic.command.actioncomandimpl.persistentity.ShowPreservation;
import logic.command.actioncomandimpl.persistentity.ShowProvider;
import logic.command.actioncomandimpl.persistentity.ShowTypeGoods;
import logic.command.actioncomandimpl.persistentity.persist.ClientPersist;
import logic.command.actioncomandimpl.persistentity.persist.Dispatch;
import logic.command.actioncomandimpl.persistentity.persist.ElementPartyPersist;
import logic.command.actioncomandimpl.persistentity.persist.GoodsPersist;
import logic.command.actioncomandimpl.persistentity.persist.OrderGoodsPersist;
import logic.command.actioncomandimpl.persistentity.persist.PersistClient;
import logic.command.actioncomandimpl.persistentity.persist.PreservationPersist;
import logic.command.actioncomandimpl.persistentity.persist.ProviderPersist;
import logic.command.actioncomandimpl.persistentity.persist.TypeGoodsPesist;
import logic.command.actioncomandimpl.show.ShowAllEntity;
import logic.command.actioncomandimpl.show.ShowPersistEntity;
import logic.command.actioncomandimpl.show.ShowTable;
import logic.command.actioncomandimpl.update.ShowUpdatePreservation;
import logic.command.actioncomandimpl.update.UpdatePreservation;
import logic.command.basiccomand.BasicCommand;

public enum MethodCommand {

	ERRORCOMMAND {
		@Override
		public BasicCommand create(HttpServletRequest request,
				HttpServletResponse response) {
			return new ErrorCommand(request, response);
		}
	},
	MAINPAGE {
		@Override
		public BasicCommand create(HttpServletRequest request,
				HttpServletResponse response) {
			return new MainPage(request, response);
		}
	},
	SHOWALLENTITY {
		@Override
		public BasicCommand create(HttpServletRequest request,
				HttpServletResponse response) {
			return new ShowAllEntity(request, response);
		}
	},
	SHOWTABLE {
		@Override
		public BasicCommand create(HttpServletRequest request,
				HttpServletResponse response) {
			// TODO Auto-generated method stub
			return new ShowTable(request, response);

		}
	},
	SHOWPERSISTENTITY {
		@Override
		public BasicCommand create(HttpServletRequest request,
				HttpServletResponse response) {
			// TODO Auto-generated method stub
			return new ShowPersistEntity(request, response);
		}
	},
	PERSISTCLIENT {
		@Override
		public BasicCommand create(HttpServletRequest request,
				HttpServletResponse response) {
			// TODO Auto-generated method stub
			return new PersistClient(request, response);
		}
	},
	DISPATCH {
		@Override
		public BasicCommand create(HttpServletRequest request,
				HttpServletResponse response) {
			return new Dispatch(request, response);
		}
	},
	SHOWDISPATCH {
		@Override
		public BasicCommand create(HttpServletRequest request,
				HttpServletResponse response) {
			return new ShowDispatch(request, response);
		}
	},
	PRESERVATIONPERSIST {
		@Override
		public BasicCommand create(HttpServletRequest request,
				HttpServletResponse response) {
			// TODO Auto-generated method stub
			return new PreservationPersist(request, response);
		}
	},
	SHOWPRESERVATION {
		@Override
		public BasicCommand create(HttpServletRequest request,
				HttpServletResponse response) {
			// TODO Auto-generated method stub
			return new ShowPreservation(request, response);
		}
	},
	SHOWPROVIDER {
		@Override
		public BasicCommand create(HttpServletRequest request,
				HttpServletResponse response) {
			// TODO Auto-generated method stub
			return new ShowProvider(request, response);
		}
	},
	PROVIDERPERSIST {
		@Override
		public BasicCommand create(HttpServletRequest request,
				HttpServletResponse response) {
			// TODO Auto-generated method stub
			return new ProviderPersist(request, response);
		}
	},
	SHOWTYPEGOODS {
		@Override
		public BasicCommand create(HttpServletRequest request,
				HttpServletResponse response) {
			// TODO Auto-generated method stub
			return new ShowTypeGoods(request, response);
		}
	},
	TYPEGOODSPERSIST {
		@Override
		public BasicCommand create(HttpServletRequest request,
				HttpServletResponse response) {
			// TODO Auto-generated method stub
			return new TypeGoodsPesist(request, response);
		}
	},
	GOODSPERSIST {

		@Override
		public BasicCommand create(HttpServletRequest request,
				HttpServletResponse response) {
			// TODO Auto-generated method stub
			return new GoodsPersist(request, response);
		}
	},
	SHOWGOODS {
		@Override
		public BasicCommand create(HttpServletRequest request,
				HttpServletResponse response) {
			// TODO Auto-generated method stub
			return new ShowGoods(request, response);
		}
	},
	CLIENTPERSIST {
		@Override
		public BasicCommand create(HttpServletRequest request,
				HttpServletResponse response) {
			// TODO Auto-generated method stub
			return new ClientPersist(request, response);
		}
	},
	SHOWCLIENT {
		@Override
		public BasicCommand create(HttpServletRequest request,
				HttpServletResponse response) {
			// TODO Auto-generated method stub
			return new ShowClient(request, response);
		}
	},
	ORDERGOODSPERSIST {
		@Override
		public BasicCommand create(HttpServletRequest request,
				HttpServletResponse response) {
			// TODO Auto-generated method stub
			return new OrderGoodsPersist(request, response);
		}
	},
	SHOWORDERGOODS {
		@Override
		public BasicCommand create(HttpServletRequest request,
				HttpServletResponse response) {
			// TODO Auto-generated method stub
			return new ShowOrderGoods(request, response);
		}
	},
	DELETEENTITY {
		@Override
		public BasicCommand create(HttpServletRequest request,
				HttpServletResponse response) {
			// TODO Auto-generated method stub
			return new DeleteEntity(request, response);
		}
	},
	UPDATEPRESERVATION {
		@Override
		public BasicCommand create(HttpServletRequest request,
				HttpServletResponse response) {
			// TODO Auto-generated method stub
			return new UpdatePreservation(request, response);
		}
	},SHOWUPDATEPRESERVATION{
		@Override
		public BasicCommand create(HttpServletRequest request,
				HttpServletResponse response) {
			// TODO Auto-generated method stub
			return new ShowUpdatePreservation(request, response);
		}
	},SHOWELEMENTPARTY{
		@Override
		public BasicCommand create(HttpServletRequest request,
				HttpServletResponse response) {
			// TODO Auto-generated method stub
			return new ShowElementParty(request, response)
			;
		}
	},ELEMENTPARTYPERSIST{
		@Override
		public BasicCommand create(HttpServletRequest request,
				HttpServletResponse response) {
			// TODO Auto-generated method stub
			return new ElementPartyPersist(request, response);
		}
	},SEARCH{
		@Override
		public BasicCommand create(HttpServletRequest request,
				HttpServletResponse response) {
			// TODO Auto-generated method stub
			return new Search(request, response);
		}
	};
	public abstract BasicCommand create(HttpServletRequest request,
			HttpServletResponse response);
}
